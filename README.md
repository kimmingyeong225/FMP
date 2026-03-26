🤝 FMP — Friend Matching Program

취미와 관심사를 기반으로 새로운 친구를 만나보세요!
Find new friends based on your hobbies and interests!

<br>
📌 목차 / Table of Contents

소개 / Introduction
주요 기능 / Features
기술 스택 / Tech Stack
설치 및 실행 / Getting Started
데모 / Demo
팀원 / Contributors

<br>

🙋 소개 / Introduction
FMP(Friend Matching Program) 는 공통 관심사와 취미를 가진 사람들을 연결해주는 친구 매칭 서비스입니다.
프로필을 등록하고 나와 잘 맞는 친구를 찾아 새로운 인연을 만들어 보세요.

<br>

✨ 주요 기능 / Features
기능설명👤 회원가입 / 로그인이메일 기반 회원가입 및 로그인📝 프로필 설정관심사, 취미, 자기소개 등록🔍 친구 매칭공통 관심사 기반 사용자 추천💬 매칭 요청원하는 사용자에게 친구 신청✅ 매칭 수락/거절받은 친구 신청 관리
<br>

🛠 기술 스택 / Tech Stack
분류기술LanguageJava 17FrameworkSpring BootBuild ToolGradleDatabase(사용 DB를 여기에 기입해주세요, e.g. MySQL / H2)IDEIntelliJ IDEA
<br>

🚀 설치 및 실행 / Getting Started
요구사항 / Prerequisites

Java 17 이상
Gradle

실행 방법 / Run
bash# 1. 레포지토리 클론 / Clone the repository
git clone https://github.com/kimmingyeong225/FMP.git
cd FMP

# 2. 설정 파일 작성 / Create config file
# src/main/resources/application.yml 파일을 생성하고 DB 정보를 입력하세요.
# Create src/main/resources/application.yml and fill in your DB credentials.

# 3. 빌드 및 실행 / Build and run
./gradlew bootRun
