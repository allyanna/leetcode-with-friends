  class ListNode {
      val: number
      next: ListNode | null
      constructor(val?: number, next?: ListNode | null) {
          this.val = (val===undefined ? 0 : val)
          this.next = (next===undefined ? null : next)
      }
  }


function partition(head: ListNode | null, x: number): ListNode | null {
    if(head === null) {
        return new ListNode();
    }
    let currHead = head; 
    let less = new ListNode(0, null); 
    let big = new ListNode(0, null);

    let currLess = less; 
    let currBig = big;

    while(currHead !== null) {
        if(currHead.val < x) {
            currLess.next = new ListNode(currHead.val, null); 
            currLess = currLess.next;
        }
        else {
            currBig.next = new ListNode(currHead.val, null); 
            currBig = currBig.next;
        }

        currHead = currHead.next; 
    }

    currLess = big.next;
    return less.next;
};
