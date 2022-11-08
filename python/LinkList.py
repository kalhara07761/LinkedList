class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_the_begining(self, data):
        node = Node(data, self.head)
        self.head = node

    def print(self):
        if self.head is None:
            print("LinkedList Is Empty")
            return

        itr = self.head
        liststr = ''

        while itr:
            liststr += str(itr.data) + '-->'
            itr = itr.next

        print(liststr)

    def insert_end_at_the_end(self, data):
        if self.head is None:
            self.head = Node(data, None)
            return
        itr = self.head
        while itr.next:
            itr = itr.next

        itr.next = Node(data, None)

    def insertValues(self, data_list):
        self.head = None
        for data in data_list:
            self.insert_end_at_the_end(data)

    def count(self):
        count = 0
        itr = self.head
        while itr:
            count += 1
            itr = itr.next
        return count

    def remove_at(self, index):
        if index < 0 or index >= self.count():
            raise Exception("Invalid index")
        if index == 0:
            self.head = self.head.next
            return

        count = 0
        itr = self.head
        while itr:
            if count == index - 1:
                itr.next = itr.next.next
                break
            itr = itr.next
            count += 1

    def insert_at(self, index, data):
        if index < 0 or index >= self.count():
            raise Exception("Invalid index")
        if index == 0:
            self.insert_at_the_begining(data)
            return

        count = 0
        itr = self.head
        while itr:
            if count == index - 1:
                node = Node(data, itr.next)
                itr.next = node
                break

            itr = itr.next
            count += 1

    def remove_by_value(self, data):
        if self.head is None:
            return

        if self.head.data == data:
            self.head = self.head.next
            return

        itr = self.head
        while itr.next:
            if itr.next.data == data:
                itr.next = itr.next.next
                break
            itr = itr.next


if __name__ == "__main__":
    list = LinkedList()
    list.insertValues(["apple", "banana", "cherry", "apple", "cherry"])
    list.print()
    list.insert_at(0, "Green apple")
    list.insert_at(2, "pineapple")
    #list.remove_by_value("banana")
    list.print()
    print("Length of the LinkedList :", list.count())
