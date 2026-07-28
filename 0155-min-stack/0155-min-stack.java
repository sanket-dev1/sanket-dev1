
class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class MinStack {
    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            st.push(new Pair(value, value));
        } else {
            int minVal = Math.min(value, st.peek().second);
            st.push(new Pair(value, minVal));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek().first;
        }
        return -1; // or throw an exception
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().second;
        }
        return -1; // or throw an exception
    }
}

// class MinStack {
//     Stack<Integer> s = new Stack<>(), st = new Stack<>();
//     public void push(int val) {
//         s.push(val);
//         if (st.isEmpty() || val <= st.peek()) st.push(val);
//     }
//     public void pop() {
//         if (s.peek().equals(st.peek())) st.pop();
//         s.pop();
//     }
//     public int top() { return s.isEmpty() ? -1 : s.peek(); }
//     public int getMin() { return st.isEmpty() ? -1 : st.peek(); }
// }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */