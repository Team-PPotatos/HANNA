# 프로젝트 종류
뽑기 게임과 사용자를 구현해보는 프로젝트이다.

## 1. 요구 사항 정리
1. 사용자는 게임 켜기, 뽑기, 미니게임하기, 게임 끄기를 할 수 있습니다.
2. 게임은 게임 켜지기, 뽑기 프로그램 켜기, 미니게임켜기, 게임 꺼지기를 할 수 있습니다.
3. 게임은 처음 꺼져있는 상태로 시작됩니다.
4. 게임을 켜지 않는다면 뽑기는 할 수 없습니다.
5. 게임이 켜져있는데 또 켤 순 없고, 게임이 꺼져있는데 또 끌 순 없습니다.
6. 뽑기에는 [1, 2, 3, ..., 30] 총 30개의 캐릭터가 있습니다. (이름은 숫자로 대체)
7. 하나의 캐릭터가 모두 같은 확률로 랜덤으로 뽑힙니다.
8. 캐릭터를 뽑는다 해도 캐릭터는 사라지지 않습니다.
9. 뽑기 한 번에 500골드가 듭니다.
10. 사용자가 처음 가지고 있는 골드는 0입니다.
11. 돈이 모자라질 때까지 계속 뽑기를 계속 돌릴 수 있습니다. 
12. 뽑기를 할 때 필요한 골드는 미니게임을 통해 벌 수 있습니다.
13. 미니게임은 한 번에 100골드에서 300골드까지 랜덤으로 벌 수 있습니다. 
14. 사용자는 얻은 캐릭터 리스트를 확인할 수 있습니다. (뽑기를 할 때마다 나오지는 않는다.) 1~30까지 얻은 캐릭터의 번호만을 출력하고, 한 줄에 10개씩 출력합니다. 얻지 못한 캐릭터는 빈 칸으로 띄어서 출력합니다.
15. 사용자가 모든 캐릭터를 얻었다면 리스트를 확인했을 때 마지막 줄에 축하문구를 출력해준다.
16. 게임을 꺼도 얻은 캐릭터와 획득 골드는 유지됩니다.

## 2. 상호작용 
[뽑기 게임 다이어그램](https://whimsical.com/charactergame-VAQ5FLwr3m8mx4ko7XRu7L)

