package TestExercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int gladius = 70;
        int shamshir = 80;
        int katana = 90;
        int sabre = 110;

        int gladiusCounter = 0;
        int shamshirCounter = 0;
        int katanaCounter = 0;
        int sabreCounter = 0;
        int sumForged = 0;

        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < firstInput.length; i++) {
            queue.add(Integer.parseInt(firstInput[i]));
            stack.push(Integer.parseInt(secondInput[i]));
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            int currentSteal = queue.peek();
            int currentCarbon = stack.peek();
            int sum = currentCarbon + currentSteal;
            if (sum == gladius) {

                gladius++;
                stack.pop();
                queue.poll();
                sumForged++;
                String gladiusKey="Gladius";
                if (!map.containsKey(gladiusKey)){
                    map.put(gladiusKey,1);
                }else {
                    map.put(gladiusKey,map.get(gladiusKey)+1);
                }
            } else if (sum == katana) {
                katanaCounter++;
                stack.pop();
                queue.poll();
                sumForged++;
                String katanaKey="Katana";
                if (!map.containsKey(katanaKey)){
                    map.put(katanaKey,1);
                }else {
                    map.put(katanaKey,map.get(katanaKey)+1);
                }
            } else if (sum == shamshir) {
                shamshirCounter++;
                stack.pop();
                queue.poll();
                sumForged++;
                String shamshirKey="Shamshir";
                if (!map.containsKey(shamshirKey)){
                    map.put(shamshirKey,1);
                }else {
                    map.put(shamshirKey,map.get(shamshirKey)+1);
                }
            } else if (sum == sabre) {
                sabreCounter++;
                stack.pop();
                queue.poll();
                sumForged++;
                String sabreKey="Sabre";
                if (!map.containsKey(sabreKey)){
                    map.put(sabreKey,1);
                }else {
                    map.put(sabreKey,map.get(sabreKey)+1);
                }
            } else {
                queue.poll();
                int increase = stack.peek() + 5;
                stack.pop();
                stack.push(increase);
            }
        }
        if (sumForged >= 1) {
            System.out.printf("You have forged %d swords.%n", sumForged);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        if (queue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            System.out.print("Steel left: ");
            while (queue.size() != 0) {
                if (queue.size() > 1) {
                    System.out.print(queue.poll() + ", ");
                } else {
                    System.out.print(queue.poll());
                }
            }
            System.out.println();
        }

        if (stack.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            System.out.print("Carbon left: ");
            while (stack.size() != 0) {
                if (stack.size() > 1) {
                    System.out.print(stack.poll() + ", ");
                } else {
                    System.out.print(stack.poll());
                }
            }
            System.out.println();
        }

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
