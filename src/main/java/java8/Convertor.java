package java8;

@FunctionalInterface
interface Convertor<F, T> {

    T convert(F from);

}
