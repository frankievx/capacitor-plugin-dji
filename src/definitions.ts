declare module '@capacitor/core' {
  interface PluginRegistry {
    DJI: DJIPlugin;
  }
}

export interface DJIPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  onReceive(videoBuffer: Array<number>, length: number): Object;
  getDisplayName(): String
}
