# spring-mvc-1

## 멀티 쓰레드
- 개발자들의 성능 튜닝 포인트는 `max thread`
- 너무 낮게 설정
  - 서버의 사양(CPU, 메모리..) 등에 비해 성능이 안나온다.
  - 성능을 늘리기 위해 서버를 증설하면 효율 대비 비용 낭비의 상황 발생
  - 이러한 부분은 개발자가 알아서 설정해줘야 하는 부분
- 너무 높게 설정
  - CPU, 메모리 리소스 임계점 초과로 서버 다운
