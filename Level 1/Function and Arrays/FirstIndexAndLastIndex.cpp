#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int *arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int data;
    cin >> data;

    // write your code here
    int i = 0;
    for (i = 0; i < n; i++)
    {
        if (arr[i] == data)
        {
            cout << i << endl;
            break;
        }
    }

    if (i == n)
        cout << -1 << endl;

    for (i = n - 1; i >= 0; i--)
    {
        if (arr[i] == data)
        {
            cout << i << endl;
            break;
        }
    }

    if (i == -1)
        cout << -1 << endl;
}