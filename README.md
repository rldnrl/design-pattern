# Design Pattern

## Chap01

### Duck Class

- FlyBehavior Interface

![image](https://user-images.githubusercontent.com/81848094/174433953-35153446-17d1-4e18-bc45-3a0a1981f503.png)

- QuackBehavior Interface

![image](https://user-images.githubusercontent.com/81848094/174433957-a299729d-a944-43b3-a53f-80f6b7db8d64.png)

- Duck Class

![image](https://user-images.githubusercontent.com/81848094/174433959-eec85f99-02bd-4385-afc1-9207dd2ce676.png)

### 전략 패턴
전략 패턴은 알고리즘 군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 사용할 수 있게 해 줍니다. 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다

## Chap02

- Subject Interface
![image](https://user-images.githubusercontent.com/81848094/175792992-4f4cf5d5-0fa8-4672-88a6-c73c97b778b4.png)

- Observer Interface
![image](https://user-images.githubusercontent.com/81848094/175792994-a1e17ac0-eccf-44e0-8c83-0196eaa7063c.png)

### 옵저버 패턴
한 객체의 상태(Subject)가 변화하면 그 객체에 의존하는 다른 객체(Observer)에게 연락이 가고 자동으로 갱신되는 일대다(Many-to-One) 의존성을 정의합니다.

- subject는 observer들이 Observer 인터페이스를 구현한다는 것을 제외하면 observer에 관련해서 아는 것이 없습니다. 그래서 **느슨한 결합** 입니다. 느슨한 결합을 사용하면, 훨씬 더 유연하고 변화에 강합니다.
- Observer Pattern은 subject가 observer에게 데이터를 보내는 방식(Push), observer가 데이터를 가져오는 방식(Pull)이 있습니다.
