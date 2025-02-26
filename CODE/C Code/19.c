// wap to find find the list frequent elements in an array
#include <stdio.h>

void find_least_frequent(int arr[], int n)
{
    int frequency[1000] = {0};
    int i, min_freq = n;
    for (i = 0; i < n; i++)
    {
        frequency[arr[i]]++;
    }
    for (i = 0; i < n; i++)
    {
        if (frequency[arr[i]] > 0 && frequency[arr[i]] < min_freq)
        {
            min_freq = frequency[arr[i]];
        }
    }
    printf("Least frequent elements: ");
    for (i = 0; i < n; i++)
    {
        if (frequency[arr[i]] == min_freq)
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
    find_least_frequent(arr, n);

    return 0;
}
