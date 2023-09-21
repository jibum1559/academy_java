package com.kh.treeMain;
/*
 * ��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
 * ���� ��ȸ : root(�Ѹ�)�� ���� ���� �湮
 * ���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 * ���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮 (�׸����� �� ����, �ݺ����� ����)
 * ���� ��ȸ : �� �� node�� ���� �Ʒ��������� ���ʴ�� �湮
 */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
		
	}
	/*
	 * insert �޼���� insertRac �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	 */
	// insert : �ܺο� ����Ǵ� �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}

	// insertRec ���� ���� �۾� �޼���
	// ����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���ǳ���
	// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
	private TreeNode insertRec(TreeNode root, int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	/*
	 * inOrderT : ������ȸ
	 * inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 * ���� ����Ʈ��, ������, ������ ����Ʈ�� ������ ��� ���
	*/
	public void inOrderT() { //inOrder Traversal ������ȯ
		inOrderTR(root);
	}
	private void inOrderTR(TreeNode root) {
		if (root != null) {
			inOrderTR(root.left);
			System.out.print(root.data + " ");
			inOrderTR(root.right);
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(100);
		tree.insert(200);
		tree.insert(350);
		tree.insert(120);
		tree.insert(500);
		tree.insert(430);
		tree.insert(220);
		tree.insert(600);
		tree.insert(380);
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
		
	}

}
