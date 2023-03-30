package com.d204.rumeet.util.amqp

import android.util.Log
import com.rabbitmq.client.Channel
import com.rabbitmq.client.ConnectionFactory
import com.rabbitmq.client.DefaultConsumer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val TAG = "RunningAMQPManager"
object RunningAMQPManager {
    val factory = ConnectionFactory().apply {
        host = "j8d204.p.ssafy.io"
        port = 5672
        username = "guest"
        password = "guest"
    }

    var runningChannel : Channel? = null

    fun initChannel() {
        CoroutineScope(Dispatchers.IO).launch {
            runningChannel = factory.newConnection().createChannel()
        }
    }

    // 내아이디와, mode를 보냄
    fun startMatching(data : String) {
        CoroutineScope(Dispatchers.IO).launch {
            runningChannel?.basicPublish("game.exchange","matching", null, data.toByteArray())
        }
    }

    // 실패를 보냄
    fun failMatching(data : String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // 27은 userid, matching과 동일한 형태로 보내기
                runningChannel?.basicPublish("game.exchange", "cancel", null, data.toByteArray())
            }catch (e : Exception){
                Log.e(TAG, "sendMessage: ${e.message}", )
            }
        }
    }

    // 구독 시작, 연결이 되면 callback 발생
    fun subscribeMatching(callback: DefaultConsumer) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                //27은 userid
                runningChannel?.basicConsume("matching.queue.27",true, callback)
            }catch (e : Exception){
                Log.e(TAG, "subscribeMatching: ${e.message}", )
            }
        }
    }
}