package me.jarad.json;

public class MyClass
{
    private Geocoded_waypoints[] geocoded_waypoints;

    private String status;

    private Routes[] routes;

    public Geocoded_waypoints[] getGeocoded_waypoints ()
    {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints (Geocoded_waypoints[] geocoded_waypoints)
    {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Routes[] getRoutes ()
    {
        return routes;
    }

    public void setRoutes (Routes[] routes)
    {
        this.routes = routes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [geocoded_waypoints = "+geocoded_waypoints+", status = "+status+", routes = "+routes+"]";
    }
}