package javaEx;

public class Tv {
  private int channel;
  private int volume;
  private boolean power;
  
  public int getChannel() {
    return channel;
  }
  public int getVolume() {
    return volume;
  }
  public boolean isPower() {
    return power;
  }
  
  /**
   * @param channel
   * @param volume
   * @param power
   */
  public Tv(int channel, int volume, boolean power) {
    this.channel = channel;
    this.volume = volume;
    this.power = power;
  }
  
  public Tv() {
    this(7,20,false);
  }
  
  public void volume(int vol) { // vol 값은 0 ~ 100 유지 해야함
    if( vol > 100 ) {
      this.volume = 100;
    }else if( vol < 0) {
      this.volume = 0;
    }else {
      this.volume = vol;
    }
  }
  
  public void volume(boolean b) { // b 가 true 인경우 볼륨 1 증가
    // b 가 true 일때 ( 볼륨 1 증가 )
    if( b ) {
      if( this.volume < 100) {
        this.volume++;
      }else {
         //System.out.println("최대 볼륨 입니다");
      }
    // b 가 false 일때 ( 볼륨 1 감소 )
    }else {
      if( this.volume > 0) {
        this.volume--;
      }else {
         //System.out.println("볼륨 0 입니다");
      }
    }
  }
  public void status() {
    System.out.println(" === TV 정보 ===");
    System.out.println(" TV 전원 : " + this.isPower());
    System.out.println(" TV 채널 : " + this.getChannel());
    System.out.println(" TV 볼륨 : " + this.getVolume());
    System.out.println(" ===   END  ===");
  }
  
  public void power(boolean b) {
    this.power = b;
  }
  
  public void power() {
    if(this.power) {
      this.power = false;
    }else {
      this.power = true;
    }
  }
  
  public void channel(boolean b) {
    // 현재 TV의 채널이 255 일 경우 
    if(this.channel == 255) {
      // b 값에 따라 증가 불가 하고, 감소 가능
      if(b) {
        
      }else {
        channel--;
      }
    }
    // 현재 TV의 채널이 1 일 경우
    else if(this.channel == 1) {
      // b 값에 따라 증가 가능 하고, 감소 불가능 
      if(b) {
        channel++;
      }else {
        
      }
    }
    // 그게 아니라면 
    else {
      // b 값에 따른동작 ( true 이면 증가, false 이면 감소)
      if(b) {
        channel++;
      }else {
        channel--;
      }
    }
  }
  public void channel(int i) { // 채널은 1~255 번을 유지 해야 함
    // i 가 0 이나 그 이하의 값이라면...
    if(i <= 0) {
      // 그런 채널 없습니다
      System.out.println("그런 채널 없습니다.");
    }
    // 그게 아니고 256 이상의 값이라면...
    else if(i >= 256) {
      System.out.println("그런 채널 없습니다.");
    }
    // 그것도 아니라면 
    else {
      // 해당 채널로 변경
      this.channel = i;
    }
    
  }
  
  
}
