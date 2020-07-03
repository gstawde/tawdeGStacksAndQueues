package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1:");
        int[] a = createStack();
        push(a,3);
        push(a,4);
        push(a,5);
        push(a,6);
        push(a,7);
        push(a,8);
        push(a,9);
        pop(a);
        pop(a);
        pop(a);
        push(a,1);
        push(a,2);
        push(a,3);
        push(a,4);
        pop(a);
        pop(a);
        pop(a);
        pop(a);
        pop(a);
        System.out.println(" - The value of the third pop is 7.");
        System.out.println(" - The value of the fifth pop is 6.");
        System.out.println("This is the stack after all the pops and pushes: " + prettyPrint(a) +"\n\n");


        System.out.println("Task 2:");
        int[] restroomList = createStack();
        System.out.println("Using a stack to store the ID numbers of students using the restroom sounds like a good idea,"
                + " but is not as great in practice.\nHere's why:\n\nLet's add these sample ID numbers to a stack" +
                ": 111111, 222222, and 333333\n(They go in chronological order i.e student 111111 used the restroom" +
                " first)\n");
        push(restroomList,111111);
        push(restroomList,222222);
        push(restroomList,333333);
        System.out.print("This is what the stack looks like right now: " + prettyPrint(restroomList) +"\n\nNow, when student" +
                " 111111 comes back, we need to take them out of the stack.\nTo do that we should simply pop them right? However," +
                "if we pop a student off the stack, this is what happens: ");
        pop(restroomList);
        System.out.println(prettyPrint(restroomList) + "\n");
        System.out.println("Rather than removing the student that returns, it simply removes the last person to go use " +
                "the restroom.\nOf course, the last student excused could have been the first to come back, however that " +
                "is typically not the case.\nA stack does not give the flexibility required to pop anything in a spot of " +
                "your choosing. It only allows you to pop the last\npiece of data inputted in the stack.\n\nTherefore, " +
                "using a stack to store the ID numbers of students using the restroom is not ideal.\n\n");


        System.out.println("Task 3:");
        int[] b = createQueue();
        enqueue(b,3);
        enqueue(b,4);
        enqueue(b,5);
        enqueue(b,6);
        enqueue(b,7);
        enqueue(b,8);
        enqueue(b,9);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        enqueue(b,1);
        enqueue(b,2);
        enqueue(b,3);
        enqueue(b,4);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        dequeue(b);
        System.out.println(" - The value of the third dequeue is 5.");
        System.out.println(" - The value of the fifth dequeue is 1.");
        System.out.println("This is the queue after the enqueues and dequeues: " + prettyPrintQueue(b) + "\n\n");


        System.out.println("Task 4:");
        int[] parkingLot = createQueue();
        System.out.println("Using a queue to store the cars parked in a one-lane, dead-end street is not a good idea.\n" +
                "Here's why:\n\nLet's add these sample cars (represented by numbers) to a queue" +
                ": 1, 2, 3, 4, 5, and 6\n(They go in chronological order i.e car 1 parked first)\n");
        enqueue(parkingLot,1);
        enqueue(parkingLot,2);
        enqueue(parkingLot,3);
        enqueue(parkingLot,4);
        enqueue(parkingLot,5);
        enqueue(parkingLot,6);
        System.out.print("This is what the queue looks like right now: " + prettyPrintQueue(parkingLot) +"\n\nNow, when car" +
                " 6 decides to leave, we need to take it out of the queue.\nTo do that we should simply enqueue it right? " +
                "However, if we enqueue a car out of the queue, this is what happens: ");
        dequeue(parkingLot);
        System.out.println(prettyPrintQueue(parkingLot) + "\n");
        System.out.println("Rather than removing the sixth car, it removes the first one." +
                "\nSince it is a dead-end street, the first car in cannot leave first in any circumstance. " +
                "Additionally, the new queue implies car 6\nis parked in two spots at once, which is not true either.\n" +
                "A queue does not give the flexibility required to dequeue anything in a spot of " +
                "your choosing. It only allows you to dequeue the first\npiece of data in the queue.\n\nTherefore, " +
                "using a queue to store the parking spots of cars on a one-way street is not ideal.\n\n");


        System.out.println("Task 5:");
        int[] rollerCoaster = createQueue();
        System.out.println("Here is an example of when one SHOULD use a stack.\nLet's say 5 people fit on each " +
                "roller coaster cart for a ride. I'm going to let 5 people on the cart (numbered one through five).");
        for (int i = 1; i <= 5; i++)
            push(rollerCoaster,i);
        System.out.println("Here is our roller coaster cart: " + prettyPrint(rollerCoaster));
        System.out.println("When the ride is over, say people all get out on the side they entered from. Given this," +
                " person 5 will exit first, rather than person 1.");
        pop(rollerCoaster);
        System.out.println("If we pop our stack, we get the same result: person 5 leaves.\nHere's what our stack looks" +
                " like after popping a person: " + prettyPrint(rollerCoaster) + "\nPerson 5 is indeed gone, and the rest " +
                "remain, therefore proving how using a stack to store those on a roller coaster ride is sensible.\n\n" );


        System.out.println("Task 6:");
        int[] movies = createQueue();
        System.out.println("Here is an example of when one SHOULD use a queue.\nLet's say 5 people want to buy tickets " +
                "to a movie. I'm going to add them to a queue.");
        for (int i = 1; i <= 5; i++)
            enqueue(movies,i);
        System.out.println("Here is our line of people right now: " + prettyPrint(movies));
        System.out.println("After someone buys a ticket, they leave. The first person in the line will be the first person" +
                " to exit said line, rather than the last one.");
        dequeue(movies);
        System.out.println("If we dequeue our queue, we get the same result: person 1 leaves.\nHere's what our queue looks" +
                " like after a dequeue: " + prettyPrint(movies) + "\nPerson 1 is indeed gone, and the rest " +
                "remain, therefore proving how using a queue to store those in line to buy movie tickets is sensible." );
    }

    // Create and return a stack that contains 101 values.
    public static int[] createStack(){

        int[] stack = new int[101]; // Create array to hold values
        stack[0] = 0; // Assign 0 as initial number of elements
        return stack;

    } // end createStack

    // Push (insert) a value into a stack, and increment the number of values by 1
    public static void push(int[] stack, int data){

        stack[(stack[0]+1)] = data; // Adds value to end of list
        stack[0] ++; // Increments number of elements by 1

    } // end push

    // Pop (take out) a value in a stack, decrementing the number of values by 1
    public static int pop(int[] stack){

        int rv = stack[stack[0]];

        stack[stack[0]] = 0; // Change assigned value at that point back to "blank" value 0
        stack[0] --; // Decrement number of values by 1

        return rv;

    } // end pop

    // Print the stack without the number of elements
    public static String prettyPrint(int[] stack){

        String rv = "[";

        for (int i = 1; i <= stack[0];i++){ // Goes through every value but the initial one holding the number of elements
            if (i != stack[0])
                rv += stack[i] + ",";
            else
                rv += stack[i];

        }
        rv += "]";

        return rv;

    } // end prettyPrint

    // Print out all of the stack including the number of elements
    public static String dumpStack(int[] stack){

        String rv = "{";

        for (int i = 0; i < stack.length;i++){ // Goes through EVERY value including the number of elements
            if (i != (stack.length-1))
                rv += stack[i] + ",";
            else
                rv += stack[i];
        }
        rv += "}";

        return rv;

    } // end dumpStack

    // Create a queue with 101 elements
    public static int[] createQueue(){

        int[] queue = new int[101]; // Create array to hold values
        queue[0] = 0; // Assign 0 as initial number of elements
        return queue;

    } // end createStack

    // Add a value to the queue, and increment number of values by 1
    public static void enqueue(int[] queue, int data){

        queue[(queue[0]+1)] = data; // Adds value to end of list
        queue[0] ++; // Increments number of elements by 1

    } // end enqueue

    // Take a value away from the queue, and decrement by 1
    public static int dequeue(int[] queue){

        int rv = queue[1]; // make return value the number being taken out

        for (int i = 1; i < queue[0];i++){
            queue[i] = queue[i+1]; // Push all the values "up" since first value is taken out not last
        }
        queue[0]--; // Decrement number of values by 1

        return rv;

    } // end dequeue

    // Print the queue without the number of elements
    public static String prettyPrintQueue(int[] queue){

        String rv = "["; // Creates return value with the opening bracket

        if (queue[queue[0] + 1] != 0) { // If value is dequeued, the last one inputted moves up, but still remains in its old spot as well
            for (int i = 1; i <= queue[0] + 1; i++) {
                if (i != (queue[0] + 1))
                    rv += queue[i] + ",";
                else
                    rv += queue[i];
            }
        }
        else {
            for (int i = 1; i <= queue[0]; i++) {
                if (i != queue[0])
                    rv += queue[i] + ",";
                else
                    rv += queue[i];
            }
        }
        rv += "]"; // Closes return value with a bracket

        return rv;

    } // end prettyPrintQueue

    // Print the entire array including the number of elements
    public static String dumpQueue(int[] queue){

        String rv = "{";

        for (int i = 0; i < queue.length;i++){ // Adds all values to return value including the number of elements
            if (i != (queue.length-1))
                rv += queue[i] + ",";
            else
                rv += queue[i];
        }
        rv += "}";

        return rv;

    } // end dumpQueue


}
