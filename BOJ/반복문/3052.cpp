#include <bits/stdc++.h>
using namespace std;

bool chk[42] = { false, };
int cnt = 0;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int n = 10;

	while (n--) {
		int num;
		cin >> num;

		if (chk[num % 42]) continue;
		else {
			chk[num % 42] = true;
			cnt++;
		}
	}
	cout << cnt;
}
// 1. 나머지는 0~41까지 총 42개
// 2. 42개 공간을 갖는 배열을 생성하여 chk할 것.
// 2-1. bool chk[42]={false,};
// 2-2. if(chk[num]) continue;
//		else chk[num]=true; cnt++;
