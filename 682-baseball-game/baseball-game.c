int calPoints(char** operations, int operationsSize)
{
    int st[1001];
    int top = -1;
    for (int i=0;i < operationsSize ;i++)
    {
        char ch = operations[i][0];
        if(ch != '+' && ch != 'C' && ch != 'D')
        {
            int a = atoi(operations[i]);
            top++;
            st[top] = a;

        }
        else if(ch == 'C')
        {
           top--;
        }
        else if (ch == 'D')
        {
            int b = st[top] * 2;
            top++;
            st[top] = b;
        }
        else if(ch == '+')
        {
            int c= st[top]+st[top - 1];
            top++;
            st[top] = c;
        }
    }
    int sum = 0;
    for (int i=top;i>=0;i--)
    {
        sum += st[i];
    }
    return sum;
}