class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1.2f);
        list.add(2.4f);
        list.add(3.6f);
        list.add(4.8f);
        list.add(6.0f);
        list.add(7.2f);

        System.out.println(list);

        list.pop();

        System.out.println(list);
        System.out.println(list.getValue(3));

        list.delete(1);

        System.out.println(list);

        list.push(1.9f);
        list.push(1.5f);

        System.out.println(list);

        list.setValue(4, 2.0f);

        System.out.println(list);
        System.out.println(list.size());
    }
}