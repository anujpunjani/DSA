/*1.Take as input String.

Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
c*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <map>
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
    char c;
    int t = 0;
    for (itr = m.begin(); itr != m.end(); itr++)
    {
        if (itr->second > t)
        {
            t = itr->second;
            c = itr->first;
        }
    }

    cout << c;

    return 0;
}
