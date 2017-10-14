'''
https://codefights.com/interview-practice/task/cAXEnPyzknC5zgd7x
You need to climb a staircase that has n steps, and you decide to get some extra exercise by jumping up the steps.
You can cover at most k steps in a single jump.
Return all the possible sequences of jumps that you could take to climb the staircase, sorted.
'''

def climbingStaircase(n, k):
    sol = []
    arr = []
    rec(n, k, arr, sol)

    return sol

def rec(n, k, arr, sol):
    if (n == 0):
        sol.append(arr)
        return
    else:
        for x in range(1, k+1):
            if (n-x < 0):
                continue

            copy = list(arr)
            copy.append(x)
            rec(n-x, k, copy, sol)

