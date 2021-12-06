#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n1, n2;
    cin >> n1;
    int *a1 = new int[n1];
    for (int i = 0; i < n1; i++)
    {
        cin >> a1[i];
    }

    cin >> n2;
    int *a2 = new int[n2];
    for (int i = 0; i < n2; i++)
    {
        cin >> a2[i];
    }

    //write your code here
    int carry = 0;
    int n3 = max(n1, n2) + 1;
    int res[n3] = {0};

    int k = n3 - 1;
    int j = n2 - 1;
    int i = n1 - 1;

    while (k)
    {
        int d1 = i >= 0 ? a1[i] : 0;
        int d2 = j >= 0 ? a2[j] : 0;

        int sum = d1 + d2 + carry;

        carry = sum / 10;
        res[k] = sum % 10;

        i--;
        j--;
        k--;
    }
    int flag = 0;
    for (int i = 0; i < n3; i++)
    {
        if (res[i] > 0)
            flag = 1;

        if (flag == 1)
            cout << res[i] << endl;
    }
}