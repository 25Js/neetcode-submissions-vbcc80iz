

public class MinStack {
    private long min;
    private Stack<Long> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L); // First element baseline
            min = val;
        } else if (val < min) {
            // Encode the new minimum
            stack.push(2L * val - min);
            min = val;
        } else {
            // Store the actual value (or val - min)
            // For simplicity in this logic, we store the actual value
            stack.push((long) val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long top = stack.pop();

        // If top < min, it's an encoded value signaling a min change
        if (top < min) {
            min = 2 * min - top; // Restore previous min
        }
    }

    public int top() {
        long top = stack.peek();
        // If top < min, the actual value is the current min
        if (top < min) {
            return (int) min;
        } else {
            return (int) top;
        }
    }

    public int getMin() {
        return (int) min;
    }
}