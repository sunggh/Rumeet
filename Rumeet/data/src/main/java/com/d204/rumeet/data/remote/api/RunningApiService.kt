package com.d204.rumeet.data.remote.api

import com.d204.rumeet.data.remote.dto.request.running.RunningInfoRequestDto
import com.d204.rumeet.data.remote.dto.request.user.SocialJoinRequestDto
import com.d204.rumeet.data.remote.dto.response.BaseResponse
import okhttp3.MultipartBody
import retrofit2.http.*

internal interface RunningApiService {
    @Multipart
    @POST("record/race")
    suspend fun recordRace(
        @Part("raceInfo") request : RunningInfoRequestDto,
        @Part file : MultipartBody.Part?,
    ) : BaseResponse<Unit?>

    @PUT("record")
    suspend fun putRace(
        @Body request : RunningInfoRequestDto
    ) : BaseResponse<Unit?>

    @POST("game/{raceId}/accept")
    suspend fun acceptRunningRequest(@Path("raceId") raceId: Int): BaseResponse<Unit>

    @POST("game/{raceId}/deny")
    suspend fun denyRunningRequest(@Path("raceId") raceId: Int) : BaseResponse<Unit>
}