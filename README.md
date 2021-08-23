
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

# day3(2021/08/20)(08/19 정보보안특강)  
## 레이아웃II(교재 6장)  
다중 레이어 중첩  
![image](https://user-images.githubusercontent.com/75231868/130178216-755bc802-19d0-4115-8fa9-6112e03ab231.png)  
하단의 버튼과 텍스트 박스는 레이어 중첩을 한것  

java 코드 내에서 setParam 메서드르르 호출하여 이벤트 발생시 비율조절이 가능하다(218p)   

그리드 레이아웃(220p)  
엑셀같은 모양을 만드는 레이아웃  

## 출력(교재 7장)  
Canvas(241p)    
뷰의 그리기 표면  
도형을 그리는 메소드   
void draw point,line,rect....()  
  
Bitmap(255p)  
사진 출력(자르기 크기조절 등)    
void drawBitmap()   
  
Text(260p)  
텍스트 출력 속성들  
  
path(266p)  
도형의 궤적 정보를 가지는 객체  
복잡한 도형을 그릴때 path 를 구성하여 그리는것이 좋다  
  
Shader(270p)  
그래디언트: 쉽게 설명해서 도형 채우기 그라데이션  

BitmapShader(277p)  
사진을 반복/그래디언트 적용  
  
토스트(288p)  
하단 작게 나타나는 메시지 출력  
  
진동(296p)  
  
퍼미션(302p)  
특정한 기능을 사용한다는 것을 명확하게 선언  

<hr>  

# day4(2021/08/23)  
## 이벤트(교재 8장)  
onTouchEvent 화면터치  
onkeydown,up 눌러진 키  

여러가지 이벤트 실습  
![image](https://user-images.githubusercontent.com/75231868/130415403-b2151b1c-053c-4595-95ae-dbeefd72d147.png)  
증감 코드 실습  
 
xml버튼코드  
android:id="@+id/btn"  
자바코드  
btn=(Button)findViewById(R.id.btn);  
        btn.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {  
                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요!!!!",Toast.LENGTH_SHORT).show();  
            }  
        });  
형태로 이벤트 처리  
  
다른방법  
  
xml코드  
android:onClick="mOnClick"  
  
자바코드  
 public void mOnClick(View v) {  
        switch (v.getId()) {  
            case R.id.down:  
                mCount--;  
                mTextCount.setText("" + mCount);  
                break;  
            case R.id.up:  
                mCount++;  
                mTextCount.setText("" + mCount);  
                break;  
        }  
    }  
  
  



