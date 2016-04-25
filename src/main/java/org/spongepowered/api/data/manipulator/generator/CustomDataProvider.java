package org.spongepowered.api.data.manipulator.generator;

import static com.google.common.base.Preconditions.checkNotNull;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.DataHolder;
import org.spongepowered.api.data.DataSerializable;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.value.BaseValue;
import org.spongepowered.api.data.value.BoundedValue;
import org.spongepowered.api.data.value.mutable.ListValue;
import org.spongepowered.api.data.value.mutable.SetValue;
import org.spongepowered.api.util.ResettableBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CustomDataProvider {

    public static RawBuilder builder() {
        return Sponge.getRegistry().createBuilder(RawBuilder.class);
    }

    public static <T extends DataManipulator<T, I>, I extends ImmutableDataManipulator<I, T>> TypeBuilder<T, I> builder(Class<T> manipulatorClass, Class<I> immutableClass) {
        return Sponge.getDataManager().createCustomBuilder(manipulatorClass, immutableClass);
    }


    public interface RawBuilder extends ResettableBuilder<DataRegistration<?, ?>, RawBuilder> {

        RawBuilder withString(Key<? extends BaseValue<String>> key, String defaultValue);

        RawBuilder withBoolean(Key<? extends BaseValue<Boolean>> key, boolean defaultValue);

        RawBuilder withInt(Key<? extends BaseValue<Integer>> key, int defaultValue);

        RawBuilder withBoundedInt(Key<? extends BoundedValue<Integer>> key, int defaultValue, int minimum, int max);

        RawBuilder withLong(Key<? extends BaseValue<Long>> key, long defaultValue);

        RawBuilder withBoundedLong(Key<? extends BoundedValue<Long>> key, long defaultValue, long minimum, long maximum);

        RawBuilder withFloat(Key<? extends BaseValue<Float>> key, float defaultValue);

        RawBuilder withBoundedFloat(Key<? extends BoundedValue<Float>> key, float defaultValue, float minimum, float maximum);

        RawBuilder withDouble(Key<? extends BaseValue<Double>> key, double defaultValue);

        RawBuilder withBoundedDouble(Key<? extends BoundedValue<Double>> key, double defaultValue, double minimum, double maximum);

        <T extends Comparable<T>> RawBuilder withBounded(Key<? extends BoundedValue<T>> key, T defaultValue, T minimum, T maximum);

        <T extends DataSerializable> RawBuilder withSerializable(Key<? extends BaseValue<? extends T>> key, T serializable);

        <E> RawBuilder list(Key<? extends ListValue<E>> key, List<E> defaultValue);

        <E> RawBuilder set(Key<? extends SetValue<E>> key, Set<E> defaultValue);

        <T> RawBuilder withObject(Key<? extends BaseValue<T>> key, T object);

        /**
         * Defines a {@link Predicate} to use
         * @param predicate
         * @return
         */
        RawBuilder predicate(Predicate<DataHolder> predicate);

        DataRegistration<?, ?> build(Object pluginInstance);

        RawBuilder id(String manipulatorId);
    }

    public interface TypeBuilder<T extends DataManipulator<T, I>, I extends ImmutableDataManipulator<I, T>> {

        DataRegistration<T, I> build(Object pluginInstance);
    }

}
