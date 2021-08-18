
# android_study  
## 자바와 안드로이드 학습 EveryTeam을 앱으로도 제작해보기위한 학습  
## 안드로이드 스튜디오 전부연결  
## 8/17 학습시작  
## 교재:안드로이드 프로그래밍 정복 1,2  
<hr>  

# day1(2021/08/17)  
## 작업환경구성,테스트  
### 실습
작업환경을 구성하고 테스트  
jdk,androidstudio,sdk,avd 설치  
테스트 앱을 만들어 avd가 잘 작동되는지 테스트  
깃허브와 안드로이드 스튜디오를 연결(앞으로 모든 과정이 깃허브에 기록)  
### 교재학습(1p~108p)
안드로이드의 의미 안드로이드 스튜디오의 구성요소  
작업환경구성 등을 학습  
안드로이드는 에물레이터의 버전과 같거나 낮아야 실행됨  
즉 sdk는 10이고 avd는 9이면 실행되지 않음  
xml파일과 엑티비티 파일로 구성  

<hr>

# day2(2021/08/18)
## 뷰(교재 4장)

string file을 res/values/strings에 정의하면  
xal파일에서 text="@string/name"으로 사용할 수 있다  

뷰의 속성(112p)  
id 뷰를 칭하는 고유의 이름  
layout_width 뷰의 폭  
layout_height 뷰의 높이  
match_parent 부모를 가득 채우는 속성  
wrap_content 객체사이즈에 맞추기  
background 뷰의 배경 색  
padding 뷰와 내용물 간의 간격  
visibility(visible,invisible,gone) 보이기 내용만숨기기 자리까지 숨기기  
clickable 클릭이벤트 
longclickable 길게 클릭 이벤트 
focusable 키보드 포커스 
  
이미지(124p) 
이미지는 png를 사용하는게 좋다  
이미지 저장폴더는 res/drawable  
앱 아이콘 res/mipmap  
이미지 호출방법 android:src="@drawable/이미지이름"  
이미지뷰의 크기를 적당히 조절 android:adjustViewBounds="true"  

## 레이아웃(교재 5장)  
리니어 레이아웃  
orientation="vertical" 위에서 아래로(수직배치)  
orientation="horizontal" 왼쪽에서 오른쪽으로(수평배치)  
  
정렬 gravity 속성(143p)  
베이스정렬 baselinealigned(152p) 값 false(상단기준 정렬) true(하단기준 정렬)  
레이아웃도 비율 분할 가능 layout_height 에 1 3 1 하면 1대 3대 1로 정렬 (154p)  
margin padding(158p)  
렐러티브레이아웃(161p)  
테이블레이아웃(178p)  

<hr>



