## CodingPractice  :memo:

Here is my coding practice repository :)

### Here Teck Stack :computer:
![Java](https://img.shields.io/badge/JAVA-3776AB.svg?&style=for-the-badge&logo=JAVA&logoColor=White)

<!-- 
https://gist.github.com/rxaviers/7360908

--> 
<!--

<img alt="Java" src ="https://img.shields.io/badge/JAVA-3776AB.svg?&style=for-the-badge&logo=JAVA&logoColor=White"/>
<img alt="JavaScript" src ="https://img.shields.io/badge/JavaScript-F7DF1E.svg?&style=for-the-badge&logo=JavaScript&logoColor=black"/>
<img src="https://img.shields.io/badge/기술이름-#제외색상번호?style=for-the-badge&logo=아이콘이름&logoColor=white">
**polarHub25/polarHub25** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->



####  ⚡ Put In My Head
[ 오름차순 / 내림차순 ]
1. 배열 오름차순
```java
  int[] param = {1,3,2,5,4};
  Arrays.sort(param);
```
2. 배열 내림차순
```java
  Integer[] param2 = {1,3,2,5,4};
  Arrays.sort(param2 , Collections.reverseOrder());
```
[ int와 Integer 차이점 ]
1. int : 변수의 타입(data type)
    - 값을 저장할 수 있는 메모리 상의 공간
    - 산술 연산 가능 / null 초기화 불가
2. Integer : int의 레퍼 클래스 (Wrapper class : 기본형을 객체로 다루기 위해 사용하는 클래스)
    - 기본형 값이 아닌 객체로 저장해야할 때 
    - 객체간 비교가 필요할 때 
    - unboxing(Integer->int) 하지 않으면 산술 연산 불가능 / null 값 처리 가능

[ charAt() ] 
  - String 문자열 중 한 글자 선택해서 char 타입으로 변환해주는 함수
```java
String s = "ABCDEF";
char flag = s.charAt(0);
System.out.println(flag); // A 출력
```
[ char / String ]
1. char 초기화 방법
```java 
char flag = ' ';(0)
char flag = " "; (x)
char flag = null (x)
```
2. char -> String 변환 방법
```java
char flag = 'c';
String str = String.valueOf(flag);
```


