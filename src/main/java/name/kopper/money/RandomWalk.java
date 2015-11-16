package name.kopper.money;

import com.google.common.collect.ImmutableList;

/**
 * Created by kopper on 13/11/15.
 */
public class RandomWalk {

    public final ImmutableList<RandomStep> steps;

    public RandomWalk(ImmutableList<RandomStep> steps) {
        this.steps = steps;
    }
}
