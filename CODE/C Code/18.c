// wap to find the most frequent elements in an array
#include <stdio.h>

void find_most_frequent(int arr[], int n)
{
    int frequency[1000] = {0};
    int i, max_freq = 0;

    for (i = 0; i < n; i++)
    {
        frequency[arr[i]]++;
        if (frequency[arr[i]] > max_freq)
        {
            max_freq = frequency[arr[i]];
        }
    }

    printf("Most frequent elements: ");
    for (i = 0; i < n; i++)
    {
        if (frequency[arr[i]] == max_freq)
        {
            printf("%d ", arr[i]);
            frequency[arr[i]] = 0;
        }
    }
}

int main()
{
    int n, i;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    find_most_frequent(arr, n);

    return 0;
}
