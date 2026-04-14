# Jec26CMJavaVol02

Java 基礎を学ぶための授業用プロジェクトです。
このリポジトリには、`Hello, World!` から始めて、標準出力、各種リテラル、算術演算、文字列連結までを学ぶための小さな独立プログラムが収録されています。

## 収録内容

- `Main.java`
  - 最初の実行例として `Hello, World!` を表示します。
- `Test0201` から `Test0215`
  - `print` と `println`
  - 整数リテラル、浮動小数点リテラル
  - `char`、`boolean`、文字列リテラル
  - エスケープシーケンス、Unicode エスケープ
  - コメントアウトされたコンパイルエラー例
- `Arith01` から `Arith03`
  - 整数演算
  - 実数演算
  - `int` と `double` を混在させた演算
- `Concat01` から `Concat03`
  - 文字列連結
  - 式の評価順序
  - `int`、`char`、`String` の違い

## NotebookLM 補足資料

https://notebooklm.google.com/notebook/fc30f692-9b4d-473d-a83c-246a7b16c92a

## 必要環境

- **JDK** 11 以上
- **IntelliJ IDEA**（Community Edition 可）

## セットアップ

1. このリポジトリをクローンする
2. IntelliJ IDEA でプロジェクトを開く
3. Project SDK に JDK 11 以上を設定する

`JecJavaTemplate.iml` があるため、IntelliJ IDEA ではそのまま読み込みやすい構成です。

## 使い方

各 Java ファイルは `public static void main(String[] args)` を持つ独立したプログラムです。
IntelliJ IDEA では、開いたファイルの `main` メソッドを実行するだけで確認できます。

コマンドラインで実行する場合:

```bash
# 例: Test0203.java をコンパイル
javac src/Test0203.java

# 実行
java -cp src Test0203
```

すべてのサンプルをまとめてコンパイルする場合:

```bash
javac src/*.java
```

## プロジェクト構成

```text
src/
├── Main.java
├── Test0201.java
├── Test0202.java
├── Test0203.java
├── Test0204.java
├── Test0205.java
├── Test0206.java
├── Test0207.java
├── Test0208.java
├── Test0209.java
├── Test0210.java
├── Test0211.java
├── Test0212.java
├── Test0213.java
├── Test0214.java
├── Test0215.java
├── Arith01.java
├── Arith02.java
├── Arith03.java
├── Concat01.java
├── Concat02.java
└── Concat03.java
```

### ファイル命名規則

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | 最初の実行例 | `Main.java` |
| `TestNNNN` | 節番号付きの基本例題 | `Test0208.java` |
| `ArithNN` | 算術演算の例 | `Arith02.java` |
| `ConcatNN` | 文字列連結の例 | `Concat03.java` |

## 学習テーマ

このリポジトリで扱う主なテーマは次のとおりです。

- Java プログラムの基本構造
- `System.out.print` と `System.out.println`
- 数値、文字、真偽値、文字列の各種リテラル
- 算術演算子 `+`, `-`, `*`, `/`, `%`
- 文字列連結と式の評価順序

## GitHub Actions

### Claude Code Review

`.github/workflows/claude-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `ANTHROPIC_API_KEY`
3. Value: Anthropic の API キー

動作:
- PR コメントまたはレビューコメントで `@claude` を付けるとレビュー応答
- 実行対象は Owner、Member、Collaborator のコメントに限定

### Junie Code Review

`.github/workflows/junie-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `JUNIE_API_KEY`
3. Value: JetBrains Junie の API キー

動作:
- PR 作成時・更新時に自動実行
- 既存のレビューコメントを更新する設定（`use_single_comment: true`）

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順
- `TUTORIAL.md` : 授業用テキスト
- `AGENTS.md` : AI エージェント向けルール
- `.junie/guidelines.md` : Junie 向け補足ガイドライン
