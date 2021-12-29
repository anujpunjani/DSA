/*1.Take as input String.

Write a function that removes all consecutive duplicates and then print desired
String.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
abc*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <map>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    map<char, int> m;
    map<char, int>::iterator itr;
    string s;
    cin >> s;

    for (int i = 0; i < s.size(); i++)
    {
        if (m.find(s[i]) != m.end())
            m[s[i]]++;
        else
            m[s[i]] = 1;
    }

    for (itr = m.begin(); itr != m.end(); itr++)
    {
        cout << itr->first;
    }

    return 0;
}
