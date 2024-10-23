# java-racingcar-precourse

# 구현할 기능 목록
## 입력 처리
- [ ] 경주할 자동차 이름 입력 (Console API)
- [ ] 시도할 횟수(몇 번의 이동) 입력 (Console API) 

## 출력 처리 
- [ ] 차수별 실행 결과 출력 (1초 마다 출력)
- [ ] 게임 결과 출력

## 게임 진행
- [ ] 자동차에 "이름"과 "현재 위치" 저장
- [ ] 0에서 9까지의 정수 중 한 개의 무작위 정수 생성 (Randoms API)
- [ ] 무작위 정수가 4 이상, 이하 확인 결과 반환
- [ ] 무작위 정수가 4 이상이면 자동차 한칸 이동, 4 이하이면 자동차 정지
- [ ] 각 자동차의 이동 결과 각 현재 위치에 저장
- [ ] 시도한 횟수에 도달 시 우승자 결정 방식에 따라 자동차 선택
- [ ] 선택된 자동차 단독 우승자, 공동 우승자 처리

### 잘못된 값의 기준:
- [ ] 경기는 2명 이상이 진행하는 것이기 때문에 쉼표(,)가 없으면 1명이므로 예외 처리
- [ ] 2명 이상이 확인되면 쉼표(,)로 분리한 글자 수 확인하여 5글자 초과 혹은 공백에 대한 예외 처리
- [ ] 시도할 횟수(몇 번의 이동)가 양수가 아니라면 예외 처리

## 유의 사항
- 실행 결과 예시의 첫 번째 결과에서 0에서 시작이 아니라 한 칸 이동 후의 결과가 나와있으므로 첫 출력은 처음 상태가 아닌 시도 1회차 출력

## 설계 고민
- 현재 위치: String ""에서 이동할 때마다 "-" 추가? or 0 에서 이동할 때마다 +1 하고 출력 시 숫자 만큼 "-" 출력?
- 박진감을 위한 차수별 실행결과를 한번에 출력하는 것이 아닌 1초마다 출력
- 우승자 결정 방식: (현재 위치 결정방식에 따라 결정) "-" length 반환해서 제일 큰것으로 결정? or else