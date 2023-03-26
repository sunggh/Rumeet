package com.d204.rumeet.friend.model.service;

import com.d204.rumeet.friend.model.dao.FriendDao;
import com.d204.rumeet.friend.model.dao.FriendRequestDao;
import com.d204.rumeet.friend.model.dto.FriendRequestDto;
import com.d204.rumeet.user.model.dto.SimpleUserDto;

import java.util.List;

public interface FriendService {

    List<FriendDao> getFriendsByUserId(int userId);

    void deleteFriend(int userId, int friendId);

    void requestFriend(FriendRequestDto friendRequestDto);

    List<FriendRequestDao> getReceiveRequests(int toUserId);

    List<FriendRequestDao> getSendRequests(int fromUserId);

    void acceptRequests(FriendRequestDto friendRequestDto);

    void rejectRequests(FriendRequestDto friendRequestDto);

    List<SimpleUserDto> searchFriend(int userId, String nickname);
}