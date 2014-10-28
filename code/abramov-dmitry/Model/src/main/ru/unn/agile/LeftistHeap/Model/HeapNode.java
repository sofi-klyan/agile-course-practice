package ru.unn.agile.LeftistHeap.Model;

public class HeapNode<TValue> {
    private int key;
    private TValue value;

    public HeapNode<TValue> LeftChild;
    public HeapNode<TValue> RightChild;

    public HeapNode(int key, TValue value) {
        this.key = key;
        this.value = value;
    }

    public HeapNode(int key, TValue value, HeapNode<TValue> leftChild, HeapNode<TValue> rightChild) {
        this.key = key;
        this.value = value;
        LeftChild = leftChild;
        RightChild = rightChild;
    }

    public int GetKey() {
        return key;
    }

    public TValue GetValue() {
        return value;
    }
}