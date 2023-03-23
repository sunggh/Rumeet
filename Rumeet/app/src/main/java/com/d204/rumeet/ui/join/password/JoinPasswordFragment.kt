package com.d204.rumeet.ui.join.password

import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.d204.rumeet.R
import com.d204.rumeet.databinding.FragmentJoinPasswordBinding
import com.d204.rumeet.ui.base.BaseFragment
import com.d204.rumeet.ui.join.JoinViewModel

class JoinPasswordFragment : BaseFragment<FragmentJoinPasswordBinding, JoinViewModel>(){
    override val layoutResourceId: Int
        get() = R.layout.fragment_join_password

    override val viewModel: JoinViewModel by activityViewModels()

    override fun initStartView() {

    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }
}