package io.github.lucasduete.padroes.criacionais.singleton;

public class ConfiguracaoSingleton {

    private static volatile ConfiguracaoSingleton configuracaoSingleton = null;
    private Integer polegadasTela;
    private Integer clockCPU;

    private ConfiguracaoSingleton() {
        this.polegadasTela = 14;
        this.clockCPU = 2500;
    }

    public static Integer getPolegadasTela() {
        return configuracaoSingleton.polegadasTela;
    }

    public static void setPolegadasTela(Integer polegadasTela) {
        configuracaoSingleton.polegadasTela = polegadasTela;
    }

    public static Integer getClockCPU() {
        return configuracaoSingleton.clockCPU;
    }

    public static void setClockCPU(Integer clockCPU) {
        configuracaoSingleton.clockCPU = clockCPU;
    }

    public static ConfiguracaoSingleton getInstance() {
        if (configuracaoSingleton == null)
            synchronized (ConfiguracaoSingleton.class) {
                if (configuracaoSingleton == null)
                    configuracaoSingleton = new ConfiguracaoSingleton();
            }

        return configuracaoSingleton;
    }
}
