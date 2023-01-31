package model;

import entity.Valuutta;

public interface IValuuttaDAO {
    public abstract boolean createValuutta(Valuutta valuutta);
    public abstract boolean updateValuutta(Valuutta valuutta);
    public abstract boolean deleteValuutta(String tunnus);
    public abstract Valuutta readValuutta(String tunnus);
    public abstract Valuutta[] readValuutat();
}
