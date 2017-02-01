package koans.streams;

import errors.EmptyKoan;
import koans.KoanFunction;

import java.util.stream.Stream;

public class StreamAnyMatch implements KoanFunction<Stream<Integer>, Boolean> {

    @Override
    public Boolean answer(Stream<Integer> integers) {
        /*
         * Given the stream, use the Stream.AnyMatch function to determine if any of the integers in the stream are
         * greater than zero.
         *
         * The Stream.AnyMatch method maps a stream element to a boolean value. If ANY of the boolean values are true,
         * then the AnyMatch method returns true. If all of the elements map to False, then the AnyMatch method returns
         * false.
         */
        throw new EmptyKoan();
    }
}
