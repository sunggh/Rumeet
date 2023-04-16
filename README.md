
# README.md

## 👩‍🏫러밋(Rumeet)은 무엇일까요?

---

함께 달리는 **비대면 러닝 매칭 서비스** 애플리케이션입니다.

## 🤔러밋은 왜 만들어졌을까요?

---

### 배경

- **러닝메이트**가 없거나 있어도 체력이 맞지 않지 않았습니다.
- 러닝을 하고 싶지만 **재미가 없어 금방 질리게** 되었습니다.
- 친구와 운동하고 싶은데 **서로 시간이 맞지 않아** 힘들었습니다.

### 해결방안

- **나의 체력 기반으로 나만의 러닝 메이트**를 추천해줍니다.
- 고스트, 경쟁, 협동과 같은 **게임 모드**를 통해 재밌는 러닝을 제공합니다.
- 실시간으로 상대방과 나의 거리를 공유하며 **함께 달릴 수 있습니다.**

## 👟러밋은 무슨 서비스를 제공할까요?

---

### 서비스 핵심 기능

**나만의 러닝 메이트 찾기**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fa1979c6-4250-4c3a-93e6-fa830f377377/Untitled.jpeg)

**********솔로, 고스트, 경쟁, 협동 달리기**********

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/68ebcbf2-6f30-4541-a384-5b8620a1b1dc/Untitled.jpeg)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2835dd1-f6cd-48e6-8e88-469d0fbb1f2d/Untitled.jpeg)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/978ed553-096b-4422-9142-29ab4c081050/Untitled.jpeg)

### ************************************서비스 전체 기능************************************

- **나만의 러닝 메이트 추천** - 나의 체력 기반으로 가장 알맞는 러닝 메이트를 추천합니다.
- **뱃지** - 러닝 참여도에 따른 뱃지를 받을 수 있습니다.
- **채팅** - 채팅을 주고 받을 수 있습니다.
- **친구** - 친구와의 매칭을 보내고 채팅을 사용할 수 있습니다.
- **나의 운동, 매칭 기록 보기** - 나의 과거 운동 기록과 매칭 기록을 볼 수 있습니다.
- **싱글 달리기** - 혼자서 1/2/3/5km를 정해 달릴 수 있습니다.
- **고스트 달리기** - 나의 과거 기록 또는 친구의 기록으로 달릴 수 있습니다.
- **경쟁 달리기** - 랜덤 혹은 친구와 함께 달리며 정해진 거리를 먼저 도달하면 승리합니다.
- **협동 달리기** - 랜덤 혹은 친구와 함게 달리며 정해진 난이도의 상어에게 도망가면 승리합니다.

## ⚙러밋을 이렇게 개발되었어요

---

### 전체 기술 스택

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9c8fca8-0e49-4c10-967a-bde324701ff1/Untitled.png)

### 시스템 구조도

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/91b41528-d902-48c3-91c1-3357f8a41aad/Untitled.png)

### 기능 명세서

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e710a9bb-c117-4725-b8d8-5af4719e974c/Untitled.png)

## 📱Android

---

### 사용한 라이브러리

| 이름 | 설명 |
| --- | --- |
| rabbitMQ | 채팅, 실시간 매칭을 위한 메시지 브로커 |
| firebase | FCM, Crashlytics, Analytics 활용 |
| Datastore | Flow 기반 로컬 저장소 라이브러리 |
| Flow | 코루틴을 활용하여 비동기 프로그래밍 구현 라이브러리 |
| hilt | DI 라이브러리 |
| kakao-sdk | 카카오 로그인, 링크를 위한 라이브러리 |
| databinding | XML에 데이터를 직접 바인딩하기 위한 라이브러리 |
| navigation | 프래그먼트 탐색을 위한 Jetpack 라이브러리 |
| circleIndicator3 | ViewPager의 인디케이터를 위한 라이브러리 |
| retrofit2 | HTTP 통신 라이브러리 |
| gson | Json 파싱을 위한 라이브러리 |
| okhttp3 | http logging과 interceptor를 위한 라이브러리 |
| balloon | 말풍선 라이브러리 |
| circleimageview | 원형 이미지를 위한 라이브러리 |
| glide | URL형식의 이미지처리를 위한 라이브러리 |

### 패키지 구조

```markdown
├── 📂app
│   ├── 📂binding_adapters
│   ├── 📂service
│   ├── 📂ui
│   │   ├── 📂activities
│   │   ├── 📂base
│   │   ├── 📂chatting
│   │   ├── 📂components
│   │   ├── 📂find_account
│   │   ├── 📂friend
│   │   ├── 📂home
│   │   ├── 📂join
│   │   ├── 📂login
│   │   ├── 📂mypage
│   │   ├── 📂notification
│   │   ├── 📂onboarding
│   │   ├── 📂reset_password
│   │   ├── 📂item_list
│   │   └── 📂running
│   ├── 📂util
│   └── ApplicationClass.kt
├── 📂domain
│   ├── 📂model
│   │   ├── 📂auth
│   │   ├── 📂chatting
│   │   ├── 📂friend
│   │   └── 📂user
│   ├── 📂repository(interface)
│   ├── 📂usecase
│   │   ├── 📂auth
│   │   ├── 📂chatting
│   │   ├── 📂friend
│   │   ├── 📂running
│   │   ├── 📂sign
│   │   └── 📂user
│   └── NetworkResult.kt
├── 📂data
│   ├── 📂local.datastore
│   ├── 📂di
│   ├── 📂remote
│   │   │   ├── 📂api
│   │   │   ├── 📂dto
│   │   │   ├── 📂interceptor
│   │   │   └── 📂mapper
│   ├── 📂repository(implementation)
│   └── 📂util
└── 📂common
```

### 아키텍처 구조

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/deee7d5e-94f8-41ca-b9e5-d356a744aa50/Untitled.png)
