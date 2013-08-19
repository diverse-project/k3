package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.Point;

@SuppressWarnings("all")
public class Segment {
  public Point begin;
  
  public Point end;
  
  public Segment(final Point orig, final Point dest) {
    this.begin = orig;
    this.end = dest;
  }
}
