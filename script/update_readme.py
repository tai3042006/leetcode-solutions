
from pathlib import Path
import re

ROOT = Path(__file__).resolve().parent.parent
README = ROOT / "README.md"

START = "<!-- LEETCODE_TABLE_START -->"
END = "<!-- LEETCODE_TABLE_END -->"

def get_problems():
    problems = []

    for folder in ROOT.iterdir():
        if not folder.is_dir():
            continue

        match = re.match(r"^(\d+)-(.+)$", folder.name)
        if not match:
            continue

        number = int(match.group(1))
        slug = match.group(2)
        title = slug.replace("-", " ").title()

        files = [
            file for file in folder.iterdir()
            if file.is_file()
            and file.suffix.lower() in {".java", ".py", ".cpp", ".cs"}
        ]

        if not files:
            continue

        links = [
            f"[{file.suffix[1:].upper()}]({file.relative_to(ROOT).as_posix()})"
            for file in files
        ]

        problems.append((number, title, ", ".join(links)))

    return sorted(problems)

def update_readme():
    problems = get_problems()

    lines = [
        "| # | Problem | Solution |",
        "|---:|---|---|"
    ]

    for number, title, links in problems:
        lines.append(f"| {number} | {title} | {links} |")

    table = "\n".join(lines)
    section = f"{START}\n{table}\n{END}"

    content = README.read_text(encoding="utf-8")

    if START in content and END in content:
        before, remainder = content.split(START, 1)
        _, after = remainder.split(END, 1)
        content = before + section + after
    else:
        content = content.rstrip() + (
            "\n\n## LeetCode Solutions\n\n" + section + "\n"
        )

    README.write_text(content, encoding="utf-8")
    print(f"README updated: {len(problems)} problems")

if __name__ == "__main__":
    update_readme()
	