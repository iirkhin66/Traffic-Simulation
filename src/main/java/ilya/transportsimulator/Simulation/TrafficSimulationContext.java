package ilya.transportsimulator.Simulation;

import ilya.transportsimulator.Geometry.Point2D;
import ilya.transportsimulator.RoadEquipment.StopLine;
import ilya.transportsimulator.RoadUsers.TRoadUser;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public record TrafficSimulationContext(
        List<StopLine> stopLines,
        List<TRoadUser> roadUsers,
        Map<Class<? extends TRoadUser>, List<List<Point2D>>> potentialPathsForRoadUsers
) {
    public void addRoadUser(final TRoadUser roadUser) {
        this.roadUsers.add(roadUser);
    }

    @Override
    public List<StopLine> stopLines() {
        return Collections.unmodifiableList(this.stopLines);
    }

    @Override
    public List<TRoadUser> roadUsers() {
        return Collections.unmodifiableList(this.roadUsers);
    }

    @Override
    public Map<Class<? extends TRoadUser>, List<List<Point2D>>> potentialPathsForRoadUsers() {
        return Collections.unmodifiableMap(this.potentialPathsForRoadUsers);
    }
}
