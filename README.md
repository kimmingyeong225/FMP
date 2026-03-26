# 🤝 FMP — Friend Matching Program

> 취미와 관심사를 기반으로 새로운 친구를 만나보세요!
> 
> Find new friends based on your hobbies and interests!

---

## 📌 목차 (Table of Contents)

1. [소개 (Introduction)](#-소개-introduction)
2. [주요 기능 (Features)](#-주요-기능-features)
3. [기술 스택 (Tech Stack)](#-기술-스택-tech-stack)
4. [설치 및 실행 (Getting Started)](#-설치-및-실행-getting-started)


---

## 🙋 소개 (Introduction)

**FMP(Friend Matching Program)** 는 공통 관심사와 취미를 가진 사람들을 연결해주는 친구 매칭 서비스입니다.
프로필을 등록하고 나와 잘 맞는 친구를 찾아 새로운 인연을 만들어 보세요.


---

## ✨ 주요 기능 (Features)

| 기능 | 설명 | Feature | Description |
|------|------|---------|-------------|
|👤 회원가입 / 로그인 | 사용자 인증 및 계정 생성 | Sign Up / Login | User authentication and account creation | 
|👤 마이페이지 | 사용자 정보 조회 및 수정 | My Page | View and update user profile |
|🔍 친구 매칭 | 사용자 성향 기반 친구 추천 | Friend Matching | Recommend friends based on user similarity |
|💬 실시간 채팅 | 매칭된 친구와 1:1 채팅 | Real-time Chat |	1:1 chat with matched users |


---

## 🛠 기술 스택 (Tech Stack)

| | |
|---|---|
| **Language** | Java 17 |
| **Framework** | Spring Boot |
| **Build Tool** | Gradle |
| **Database** | *(e.g. MySQL / H2)* |
| **IDE** | IntelliJ IDEA |

---

## 🚀 설치 및 실행 (Getting Started)

**Requirements:** Java 17+, Gradle

```bash
# 1. 클론 / Clone
git clone https://github.com/kimmingyeong225/FMP.git
cd FMP

# 2. application.yml 생성 후 DB 정보 입력
# Create application.yml and fill in your DB credentials
# src/main/resources/application.yml

# 3. 실행 / Run
./gradlew bootRun
```
