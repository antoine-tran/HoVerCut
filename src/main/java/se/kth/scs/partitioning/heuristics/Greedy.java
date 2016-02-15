package se.kth.scs.partitioning.heuristics;

import java.util.List;
import se.kth.scs.partitioning.Partition;
import se.kth.scs.partitioning.Vertex;

/**
 *
 * @author Hooman
 */
public class Greedy implements Heuristic {

  private final double epsilon;

  public Greedy(double epsilon) {
    this.epsilon = epsilon;
  }

  @Override
  public Partition allocateNextEdge(Vertex v1, Vertex v2, List<Partition> partitions) {
    // Compute C score for each partition.
    double maxScore = Long.MIN_VALUE;
    Partition maxPartition = null;

    int maxSize = Integer.MIN_VALUE;
    int minSize = Integer.MAX_VALUE;

    for (Partition p : partitions) {
      if (p.getESize() > maxSize) {
        maxSize = p.getESize();
      }
      if (p.getESize() < minSize) {
        minSize = p.getESize();
      }
    }

    for (Partition p : partitions) {
      double sRep = computeReplicationScore(p, v1, v2);
      double sBal = computeBalanceScore(p, maxSize, minSize, epsilon);

      double score = sRep + sBal;
      if (score > maxScore) {
        maxScore = score;
        maxPartition = p;
      }
    }

//    if (maxPartition == null)
//    {
//      System.out.println();
//    }
    //MaxPartition should not be null
    return maxPartition;
  }
  
  public static double computeReplicationScore(Partition p, Vertex v, Vertex u) {
    double sr = 0;
    if (v.containsPartition(p.getId())) {
      sr++;
    }
    
    if (u.containsPartition(p.getId())) {
      sr++;
    }
    
    return sr;
  }

  private static double computeBalanceScore(Partition p, int maxSize, int minSize, double epsilon) {
    int edgeSize = p.getESize();
    return (maxSize - edgeSize) / (epsilon + maxSize - minSize);
  }

}
