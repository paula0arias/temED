class Nodo:
    def __init__(self, dato = None, next = None):
        self.dato = dato
        self.next = next
 

class linked_list: 
    def __init__(self):
        self.head = None
    
    
    def addFront(self, dato):
        self.head = Nodo(dato=dato, next=self.head)  
 
    
    def is_empty(self):
        return self.head == None
 
    
    def addEnd(self, dato):
        if not self.head:
            self.head = Nodo(dato=dato)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = Nodo(dato=dato)
    
    
    def deleteNode(self, key):
        curr = self.head
        prev = None
        while curr and curr.dato != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None
 
    
    def get_last_node(self):
        temp = self.head
        while(temp.next is not None):
            temp = temp.next
        return temp.dato
 
    
    def printList( self ):
        node = self.head
        while node != None:
            print(node.dato, end =" ")
            node = node.next
 
mostrarL = linked_list()
mostrarL.addFront(5) 
mostrarL.addEnd(8) 
mostrarL.addFront(9) 
 
mostrarL.printList() 

