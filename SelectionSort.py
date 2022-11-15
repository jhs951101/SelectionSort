arr = [4, 3, 1, 5, 2]
# arr: 정렬할 값들이 들어있는 배열

for x in range(len(arr)-1):
    for y in range(x+1, len(arr)):
        # 오름차순 정렬이므로 왼쪽 값이 더 크면 서로 맞바꿈
        if arr[x] > arr[y]:
            swap = arr[x]
            arr[x] = arr[y]
            arr[y] = swap

for i in range(len(arr)):
    print(arr[i], end=' ')