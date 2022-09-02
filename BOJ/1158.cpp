#include <bits/stdc++.h>
using namespace std;

// STL 큐를 이용한 구현.
// k-1번 만큼 맨앞의 원소를 맨뒤에 배치하고, k번째일 때 맨 앞의 원소를 출력 및 제거.
// q가 빌 때 까지 반복.

int main(void) {
	queue<int> q;

	int n, k;
	cin >> n >> k;

	// queue 초기화
	for (int i = 1; i <= n; i++) q.push(i);
	cout << "<";

	while (!q.empty()) {
		for (int i = 1; i < k; i++) {
			q.push(q.front());
			q.pop();
		}
		if (q.size() == 1) cout << q.front();
		else cout << q.front() << ", ";
		q.pop();
	}
	cout << ">";
}
