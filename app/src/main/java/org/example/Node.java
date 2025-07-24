package org.example;

public class Node {
  private Squirrel data;
  private Node left;
  private Node right;

  public Node(Squirrel data) {
    this.data = data;
  }

  public Squirrel get_data() {
    return data;
  }

  public void set_left(Node node) {
    this.left = node;
  }

  public void set_right(Node node) {
    this.right = node;
  }

  public Node left() {
    return this.left;
  }

  public Node right() {
    return this.right;
  }
}