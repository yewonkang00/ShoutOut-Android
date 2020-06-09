# Kimmessicorp

안녕하세요 이번에 오픈소스 프로젝트를 하게된 Kimmessicorp입니다.

저희 팀은 이번에 채팅 어플을 만들어볼 예정입니다.

어플은 프론트엔드 - 백엔드 - DB 3tier 구조로 설계할 예정입니다.

멤버

2019054693 강예원

2019041094 김정민

2019082206 윤성빈

앱 설계 

로그인 창 만들기, 회원가입 창, DB설계, 게시판 만들기

로그인 창
1. 첫화면에 띄움
2. 아이디, 같은 비밀번호를 입력했을 경우 DB에서 찾아와 이름, 나이 정보 넘겨받기
3. 일치하는 회원정보가 없을 경우 회원정보가 없다는 창 띄우기

회원가입 창
1. 로그인 밑에 회원가입 버튼을 만들어 그 버튼을 누르면 회원가입 화면으로 전환
2. 아이디, 비밀번호, 이름, 나이 등 기본정보를 받아 DB로 넘겨 저장하기
3. 회원가입할때 editText 이용, Intent를 이용하여 입력받은 텍스트 넘기기

메뉴판

1.슬라이드를 넘기거나 버튼을 누를 때 보임.

2.메뉴판에는 회원의 아이디나 각종 설정 등이 있음.



게시판
1. 로그인이 되면 게시판화면으로 전환
2. +버튼을 만들고 그 버튼을 누르면 게시물을 작성하는 화면으로 넘기기
3. 게시물 작성화면에서 작성한 제목을 게시판 화면에 올리기
4. 게시물 최신순이 위로 오도록
5. 게시판에서 글을 누르면 게시물화면으로 전환

게시물 작성
1. +버튼을 누르면 작성화면으로 화면전환
2. 제목과 내용 칸 만들기
2. 텍스트 입력받기
3. 완료버튼을 누르면 작성한 텍스트 DB에 넘기고 게시물 화면에 올리기

게시물 화면
1. 게시물 작성이 완료된 화면
2. 제목, 내용, 글쓴이, 작성날짜 정보 띄우기

DB는 2개 필요함
1. 회원정보(아이디, 비밀번호, 이름, 나이)
2. 게시물 정보(제목, 내용, 글쓴이, 작성날짜)

3tier 구조 설계

우선 서버는 닷홈이라는 사이트에서 무료 호스팅을 합니다.

kimmessi.dothome.co.kr 이게 서버 호스팅 사이트이고,

DB 설계는 

http://kimmessi.dothome.co.kr/myadmin 에서 DB를 구현합니다. 

비밀번호는 s01020304s! 입니다.




