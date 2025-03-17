package gr.aueb.cf.ch16.challenge2;

/**
 * IShape skeletal impl.
 */
public abstract class AbstractShape implements IShape {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId(){
        return id;
    }
}
