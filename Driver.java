import java.util.Scanner;

//Driver Program for Lever Order Traversal of Binary Tree, Pressing zero will 
// print the level order for the BST
public class Driver {
public static void main(String[] args) {
	
		BST<Integer> t = new BST<>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int x = in.nextInt();
			if (x > 0) {
				System.out.print("Add " + x + " : ");
				t.add(x);
				t.printTree();
			} else if (x < 0) {
				System.out.print("Remove " + x + " : ");
				t.remove(-x);
				t.printTree();
			} else {
			/*	Comparable[] arr = t.toArray();
				System.out.print("Final: ");
				for (int i = 0; i < t.size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				break;
				
				*/
								
				System.out.println("Level Order is :");
				Comparable[] array=t.levelOrderArray();
				for (int i = 0; i < t.size; i++) {
					System.out.print(array[i] + " ");
			}
				return;
		}
		
		
		
		}
	}
}


