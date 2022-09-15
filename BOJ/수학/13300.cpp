#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int arr[3][7] = {};

	int n, k, s, y;
	int ans = 0;
	cin >> n >> k;

	while (n--) {
		cin >> s >> y; // 성별, 학년 입력받기
		arr[s][y]++;
	}

	for (int s = 0; s <= 1; s++) { // 성별
		for (int y = 1; y <= 6; y++) { // 학년
			if (arr[s][y] == 0) continue; // 배정인원 X는 Pass

			if (arr[s][y] % k == 0) { // 배정인원이 K와 딱 떨어질 때
				ans += arr[s][y] / k;
			}
			else {
				ans += (arr[s][y] / k) + 1;
			}
		}
	}

	cout << ans;
}
