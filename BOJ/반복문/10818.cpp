#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int n, max, min;
	cin >> n;
	cin >> max;
	min = max;

	while (--n) { // 위에서 첫 번째 수를 미리 읽었기 때문에 --n
		int num;
		cin >> num;
		if (num >= max) max = num;
		else if (num <= min) min = num;
	}

	cout << min << " " << max;
}

// 1. max, min을 첫번째 수로 초기화한다.
// 2. n개의 수를 읽어 max와 min을 갱신한다.
