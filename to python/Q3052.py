import sys

if __name__ == "__main__":

    num_list = []

    for i in range(0, 10):
        num_list.append(int(sys.stdin.readline()))

    ex_list = []
    ex = 0;

    for i in range(0, 10):
        ex = num_list[i] % 42
        if ex not in ex_list:
            ex_list.append(ex)

    print(len(ex_list))
